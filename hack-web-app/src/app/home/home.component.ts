import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';
import {Observable} from 'rxjs';

export interface Location {
  latitude: number;
  longitude: number;
}

export interface SnappedPoint {
  location: Location;
  originalIndex: number;
  placeId: string;
}

export interface SnappedPoints {
  snappedPoints: SnappedPoint[];
}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private users: UserService) { }
  response: any;

  isLoaded: boolean = false;
  snappedPoints: Observable<SnappedPoints>;

  ngOnInit(): void {
    this.users.getUserStatistics().subscribe(
      data => {
        console.log(data);
      },
      error => console.error(error)
    );

    this.users.getUserRoute().subscribe(
      data => {
        // console.log(data["body"]);
        this.snappedPoints = JSON.parse(data['body']) as Observable<SnappedPoints>;
        this.isLoaded = true;
      },
      error => console.error(error)
    );

    // this.users.getCommute().subscribe(
    //   data => {
    //     console.log(data);
    //     this.snappedPoints = data;
    //   },
    //   error => console.error(error)
    // );

  }

}
