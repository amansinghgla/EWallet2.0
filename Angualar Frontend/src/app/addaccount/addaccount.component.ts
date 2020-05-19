import { Component, OnInit } from '@angular/core';
import { WalletUser } from '../walletuser';
import{WalletuserService} from'../walletuser.service';

@Component({
  selector: 'app-addaccount',
  templateUrl: './addaccount.component.html',
  styleUrls: ['./addaccount.component.css']
})
export class AddaccountComponent implements OnInit {
  walletuser:WalletUser=new WalletUser();
  msg:String;
  errorMsg:String;
  constructor(private walletuserService:WalletuserService) { }
  

  ngOnInit(): void {
  }
  addAccount(){
    this.walletuserService.addAccount(this.walletuser).subscribe((data)=>{
      console.log("data",data);
      this.msg=data;
      this.errorMsg=undefined;
      this.walletuser=new WalletUser()},
      error=>{this.errorMsg=JSON.parse(error.error).message;
      console.log(error.error);
      this.msg=undefined});
  }


}
