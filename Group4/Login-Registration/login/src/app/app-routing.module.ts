import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponentComponent } from './login-component/login-component.component';
import { RegisterComponentComponent } from './register-component/register-component.component';
import {HomeComponentComponent} from './home-component/home-component.component';
 
const routes: Routes = [{path:'login', component:LoginComponentComponent},
{ path:'reg', component:RegisterComponentComponent},
{path:'', component:HomeComponentComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})


export class AppRoutingModule { }
export const routingComponents=[LoginComponentComponent,RegisterComponentComponent]
