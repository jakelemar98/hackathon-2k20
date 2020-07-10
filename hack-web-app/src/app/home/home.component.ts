import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private users: UserService) { }
  response: any;

  snappedPoints$: Observable<object>;

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
        this.response = data['body'];

        this.snappedPoints$ = JSON.parse(this.response);
        console.log(this.snappedPoints$);
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
