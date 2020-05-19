import { Component, OnInit } from '@angular/core';
import {CustomerSupport} from '../customersupport';
import{CustomersupportService} from'../customersupport.service';

@Component({
  selector: 'app-customersupport',
  templateUrl: './customersupport.component.html',
  styleUrls: ['./customersupport.component.css']
})
export class CustomersupportComponent implements OnInit {
  customersupport:CustomerSupport=new CustomerSupport();
  msg:String;
  errorMsg:String;
  constructor(private customersupportService:CustomersupportService) { }



  ngOnInit(): void {
  }

    addIssue(){
      this.customersupportService.addIssue(this.customersupport).subscribe((data)=>{
        console.log("data",data);
        this.msg=data;
        this.errorMsg=undefined;
        this.customersupport=new CustomerSupport()},
        error=>{this.errorMsg=JSON.parse(error.error).message;
        console.log(error.error);
        this.msg=undefined});
    }
  
  }


