import {Component, Input, OnInit, Optional} from '@angular/core';
import {SnappedPoints} from '../shared/models/snapped-points.model';
import {UserService} from '../user.service';

@Component({
  selector: 'app-google-maps',
  templateUrl: './google-maps.component.html',
  styleUrls: ['./google-maps.component.scss']
})
export class GoogleMapsComponent implements OnInit {

  constructor(private users: UserService) { }

  @Optional() @Input() snappedPoints: object;
  @Optional() @Input() center: google.maps.LatLngLiteral;

  zoom = 15;
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

    console.log(this.snappedPoints);
    if (this.snappedPoints) {
      let latLngLiteral: google.maps.LatLngLiteral;

      console.log(this.snappedPoints['snappedPoints']);
      this.snappedPoints['snappedPoints'].forEach(point => {
        console.log(point);
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
    }

    // navigator.geolocation.getCurrentPosition(position => {
    //   this.center = {
    //     lat: position.coords.latitude,
    //     lng: position.coords.longitude,
    //   };
    // });
  }

}
