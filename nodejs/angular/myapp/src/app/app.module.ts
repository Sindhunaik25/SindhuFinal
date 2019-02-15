import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './components/user/user.component';
/* import { EmpComponent } from './components/emp/emp.component';
import { StudentComponent } from './components/student/student.component';
import { UserRegistrationComponent } from './components/user-registration/user-registration.component';*/
import { EmpListComponent } from './emp-list/emp-list.component'; 
import { CarouselModule } from 'ngx-bootstrap/carousel';
import { EmpsearchPipe } from './empsearch.pipe';

@NgModule({//decorates the class,once it is decorated ,then normal class becomes ngmodule
  declarations: [
    AppComponent,
    UserComponent,
    /* EmpComponent,
    StudentComponent,
    UserRegistrationComponent,*/
    EmpListComponent,
    EmpsearchPipe 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    CarouselModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }//ngModule class
