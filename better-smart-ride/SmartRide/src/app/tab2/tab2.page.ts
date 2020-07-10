import { Component } from '@angular/core';
import { GoogleMaps, GoogleMapsEvent, LatLng, MarkerOptions, Marker, GoogleMapOptions} from '@ionic-native/google-maps';
import { Platform } from '@ionic/angular';
import {MatListModule} from '@angular/material/list';


@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  constructor(public platform: Platform) {}



  ngAfterViewInit() {
    this.platform.ready().then(() => this.loadMap());
  }

  loadMap() {
    const map = GoogleMaps.create('map');

    map.one( GoogleMapsEvent.MAP_READY ).then((data: any) => {
			const coordinates: LatLng = new LatLng(-93.618197, 41.590213);

      //map.setMyLocationEnabled;
      map.setCameraTarget(new LatLng(41.590213, -93.618197));
      let mapOptions: GoogleMapOptions = {
        camera: {
           target: {
             lat: 41.590213,
             lng: -93.618197
           },
           zoom: 10,
           tilt: 30
         }
      };
		
		});
  }
}
