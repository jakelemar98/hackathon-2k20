import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private users: UserService) { }
  response: any;

  markers: Array<google.maps.Marker>;

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
        this.response = data["body"];

        let json = JSON.parse(this.response)
        console.log(json);
        

        const latLng = {
          lat: 41.5868,
          lng: -93.6250,
        };

        this.markers.push(new google.maps.Marker({
          position: latLng,
          title: 'Marker'
        }));
      },
      error => console.error(error)
    );
  }

}
