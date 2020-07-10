import { Component, OnInit } from '@angular/core';
import * as CanvasJS from 'canvasjs/dist/canvasjs.js';
//var CanvasJS = require('canvasjs/dist/canvasjs.js');

@Component({
	selector: 'app-line-chart',
	templateUrl: './line-chart.component.html',
	styleUrls: ['./line-chart.component.scss']
})

export class LineChartComponent implements OnInit {
	ngOnInit() {
	let speedLimits = [];
	let userSpeeds = [];

	for (var i = 0; i < 10; i++){
	  speedLimits.push({y: 2});
	  userSpeeds.push( { y: 3});
	}

	let chart = new CanvasJS.Chart("chartContainer", {
		  title: {
			  text: "Speed Limit vs User Speed"
		  },
		  axisX: {
		    interval: 1
		  },
		  axisY: {
		    interval: 5,
		    suffix: " MPH"
		  },
		  legend: {
		    cursor: "pointer",
		    verticalAlign: "bottom",
		    horizontalAlign: "left",
		    dockInsidePlotArea: true
		  },
		  data: [{
			  type: "line",
			  showInLegend: true,
			  name: "Speed Limit",
			  dataPoints: [
			    {x: 1, y : 5},
			    {x: 2, y : 5},
			    {x: 3, y : 5},
			    {x: 4, y : 5},
			    {x: 5, y : 5},
			    {x: 6, y : 5},
			    {x: 7, y : 5}
			  ]
	    },
	    {
	      type: "line",
	      showInLegend: true,
	      name: "Users Speed",
        dataPoints: [
          {x: 1, y : 15},
          {x: 2, y : 15},
          {x: 3, y : 15},
          {x: 4, y : 15},
          {x: 5, y : 15},
          {x: 6, y : 15},
          {x: 7, y : 15}
        ]
	    }]
	   });

	    chart.render();
   }
}

