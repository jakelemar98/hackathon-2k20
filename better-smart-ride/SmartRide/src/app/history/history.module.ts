import { IonicModule } from '@ionic/angular';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HistoryPage } from './history.page';
import { MaterialModule } from '../material.module';
import { ExploreContainerComponentModule } from '../explore-container/explore-container.module';

import { HistoryPageRoutingModule } from './history-routing.module';
import { MatToolbarModule } from '@angular/material/toolbar';
import { ChartsModule } from 'ng2-charts';

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    ExploreContainerComponentModule,
    HistoryPageRoutingModule,
    MaterialModule,
    MatToolbarModule,
    ChartsModule
    
  ],
  declarations: [HistoryPage]
})
export class HistoryPageModule {}
