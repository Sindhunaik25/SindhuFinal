import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myapp';
  firstname="Sindhu";
  lastname="Naik";
  location:Address={
    "street":"Siddapura",
    "city":"sirsi"
  };
}
class Address
{
  street:string;
  city:string;
}
