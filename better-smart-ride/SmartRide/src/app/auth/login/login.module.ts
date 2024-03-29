import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { LoginPageRoutingModule } from './login-routing.module';

import { LoginPage } from './login.page';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
//import { MatSpinner } from '@angular/material';
import { MatButtonModule } from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    LoginPageRoutingModule,
    MatCardModule,
    MatInputModule,
  //  MatSpinner,
   MatButtonModule
  ],
  declarations: [LoginPage]
})
export class LoginPageModule {}
