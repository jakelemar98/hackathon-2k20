import {Component, ElementRef, Input, OnInit, Optional, ViewChild} from '@angular/core';

@Component({
  selector: 'app-google-maps',
  templateUrl: './google-maps.component.html',
  styleUrls: ['./google-maps.component.scss']
})
export class GoogleMapsComponent implements OnInit {

  constructor() { }

  // @ViewChild('map', { static: false }) mapElement: ElementRef;
  // map: google.maps.Map;

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

  flightPath: google.maps.Polyline;

  // mapOfInfo: Map<google.maps.Marker, google.maps.InfoWindow> = new Map();

  ngOnInit(): void {
    this.center = {
      lat: 41.5868,
      lng: -93.6250,
    };

    // const mapProperties = {
    //   center: new google.maps.LatLng(41.5868, -93.6250),
    //   zoom: 15,
    //   mapTypeId: google.maps.MapTypeId.ROADMAP,
    //   options: this.options,
    // };
    // this.map = new google.maps.Map(this.mapElement.nativeElement, mapProperties);

    console.log(this.snappedPoints);
    if (this.snappedPoints) {
      let latLngLiteral: google.maps.LatLngLiteral;

      const flightPathCoordinates = [
        {lat: null, lng: null}
      ];

      console.log(this.snappedPoints['snappedPoints']);
      this.snappedPoints['snappedPoints'].forEach(point => {
        latLngLiteral = {
          lat: point.location.latitude,
          lng: point.location.longitude
        };

        const marker = new google.maps.Marker({
          position: latLngLiteral,
          title: point.placeId
        });

        // const infoWindow = new google.maps.InfoWindow({
        //   content: '<p>Hello</p>',
        // });
        //
        // this.mapOfInfo.set(marker, infoWindow);
        //
        // marker.addListener('click', () => {
        //   this.mapOfInfo.get(marker).open(this.map, marker);
        // });

        this.markers.push(marker);
        if (point.originalIndex) {
          this.originalMarkers.push(marker);
        }

        flightPathCoordinates.push({lat: point.location.latitude, lng: point.location.longitude});

      });

      console.log(flightPathCoordinates);
      this.flightPath = new google.maps.Polyline({
        path: flightPathCoordinates,
        geodesic: true,
        strokeColor: '#FF0000',
        strokeOpacity: 1.0,
        strokeWeight: 2
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
