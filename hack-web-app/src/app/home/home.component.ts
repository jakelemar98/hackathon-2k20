import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private users: UserService) { }

  markers: Array<google.maps.Marker>;

  ngOnInit(): void {
    this.users.getUserStatistics().subscribe(
      data => {
        console.log(data);

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

    this.users.getUserTripData().subscribe(
      data => console.log(data),
      error => console.error(error)
    );
  }

}
