import { Component, OnInit, ViewChild } from '@angular/core';
import { ChartsModule, Label, Color } from 'ng2-charts';
import { ChartDataSets, ChartOptions } from 'chart.js';



@Component({
  selector: 'app-history',
  templateUrl: 'history.page.html',
  styleUrls: ['history.page.scss']
})
export class HistoryPage {

  chartOptions = {
    responsive: true
  };
  chartData = [
    { data: [67, 68, 74, 78, 82, 76, 89], label: 'Overall Driving Grade' },

  ];
  chartLabels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];

  chart2Options = {
    responsive: true
  };
  chart2Data = [
    { data: [110, 99, 87, 76, 81, 75, 74], label: 'Number of hard breaks' },

  ];
  chart2Labels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];

  chart3Options = {
    responsive: true
  };
  chart3Data = [
    { data: [129, 120, 119, 117, 118, 116, 115], label: 'Premium Cost' },

  ];
  chart3Labels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];

  constructor() {}

  ngOnInit(){}
}
