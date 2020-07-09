import { Component } from '@angular/core';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  constructor() {}

  // zoom = 12;
  // center: google.maps.LatLngLiteral;
  // options: google.maps.MapOptions = {
  //   mapTypeId: 'hybrid',
  //   zoomControl: false,
  //   scrollwheel: false,
  //   disableDoubleClickZoom: true,
  //   maxZoom: 15,
  //   minZoom: 8,
  // };

  // ngOnInit(): void {
  //   navigator.geolocation.getCurrentPosition(position => {
  //     this.center = {
  //       lat: position.coords.latitude,
  //       lng: position.coords.longitude,
  //     };
  //   });
  // }

  // zoomIn() {
  //   if (this.zoom < this.options.maxZoom) { this.zoom++; }
  // }

  // zoomOut() {
  //   if (this.zoom > this.options.minZoom) { this.zoom--; }
  // }
}
