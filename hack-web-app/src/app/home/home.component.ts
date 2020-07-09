import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private users: UserService) { }

  ngOnInit(): void {    
    this.users.getUserStatistics().subscribe(
      data => console.log(data),
      error => console.error(error)
    );
  }

}
