import {Component, Input, OnInit} from '@angular/core';
import {SnappedPoints} from '../shared/models/snapped-points.model';
import {UserService} from '../user.service';

@Component({
  selector: 'app-google-maps',
  templateUrl: './google-maps.component.html',
  styleUrls: ['./google-maps.component.scss']
})
export class GoogleMapsComponent implements OnInit {

  constructor(private users: UserService) { }

  @Input() snappedPoints: SnappedPoints[];

  zoom = 15;
  center: google.maps.LatLngLiteral;
  options: google.maps.MapOptions = {
    mapTypeId: 'hybrid',
    zoomControl: true,
    scrollwheel: true,
    disableDoubleClickZoom: false,
    maxZoom: 17,
    minZoom: 10,
  };

  markers: google.maps.Marker[] = [];
  originalMarkers: google.maps.Marker[] = [];

  ngOnInit(): void {
    this.center = {
      lat: 41.5868,
      lng: -93.6250,
    };

    this.users.getCommute().subscribe(
      data => {

        let latLngLiteral: google.maps.LatLngLiteral;

        data['snappedPoints'].forEach(point => {
          latLngLiteral = {
            lat: point.location.latitude,
            lng: point.location.longitude
          };

          this.markers.push(new google.maps.Marker({
            position: latLngLiteral,
            title: point.placeId
          }));

          if (point.originalIndex) {
            this.originalMarkers.push(new google.maps.Marker({
              position: latLngLiteral,
              title: point.placeId
            }));
          }
        });
      },
      error => console.error(error)
    );

    // navigator.geolocation.getCurrentPosition(position => {
    //   this.center = {
    //     lat: position.coords.latitude,
    //     lng: position.coords.longitude,
    //   };
    // });
  }

}
