import {Optional} from '@angular/core';

export class SnappedPoints {
  location: google.maps.LatLngLiteral;
  placeId: string;
  originalIndex: number;

  constructor(location: google.maps.LatLngLiteral, placeId: string, @Optional() originalIndex: number) {
    this.location = location;
    this.placeId = placeId;
    this.originalIndex = originalIndex;
  }
}
