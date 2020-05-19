import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddaccountComponent } from './addaccount/addaccount.component';
import { HomeComponent } from './home/home.component';
import{ LoginComponent}   from './login/login.component';
import { CustomersupportComponent } from './customersupport/customersupport.component';

const routes: Routes = [
  {path:'',redirectTo:'home',pathMatch: 'full'},
  {path: 'home',component:HomeComponent},
  {path:'addaccount', component:AddaccountComponent},
  {path:'login',component:LoginComponent},
  {path:'customersupport',component:CustomersupportComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
