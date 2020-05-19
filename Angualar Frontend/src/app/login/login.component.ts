import { Component, OnInit } from '@angular/core';
import { WalletUser } from '../walletuser';
import{WalletuserService} from'../walletuser.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  walletuser:WalletUser=new WalletUser();
  msg:String;
  errorMsg:String;
  constructor(private walletuserService:WalletuserService) { }


  
  

  

  ngOnInit(): void {
  }
  
  loginWalletUser(){
    this.walletuserService. loginWalletUser(this.walletuser).subscribe((data)=>{
      console.log("data",data);
      this.msg=data;
      this.errorMsg=undefined;
      this.walletuser=new WalletUser()},
      error=>{this.errorMsg=JSON.parse(error.error).message;
      console.log(error.error);
      this.msg=undefined});
  }
    

}
