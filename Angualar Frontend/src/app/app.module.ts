import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddaccountComponent } from './addaccount/addaccount.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CustomersupportComponent } from './customersupport/customersupport.component';
import { WalletuserService } from './walletuser.service';

@NgModule({
  declarations: [
    AppComponent,
    AddaccountComponent,
    HomeComponent,
    LoginComponent,
    CustomersupportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [WalletuserService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
