import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-google-maps',
  templateUrl: './google-maps.component.html',
  styleUrls: ['./google-maps.component.scss']
})
export class GoogleMapsComponent implements OnInit {

  constructor() { }

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

  position: google.maps.LatLngLiteral;

  ngOnInit(): void {
    this.center = {
      lat: 41.5868,
      lng: -93.6250,
    };

    this.position = {
      lat: 41.5868,
      lng: -93.6250,
    };

    // navigator.geolocation.getCurrentPosition(position => {
    //   this.center = {
    //     lat: position.coords.latitude,
    //     lng: position.coords.longitude,
    //   };
    // });
  }

}
