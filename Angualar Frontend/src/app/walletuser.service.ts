import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import  {WalletUser}  from './walletuser'

@Injectable({
  providedIn: 'root'
})
export class WalletuserService {

  constructor(private http:HttpClient) { }



  public addAccount(walletuser:WalletUser):Observable<any>{
    return this.http.post("http://localhost:8091/add",walletuser,{responseType:'text'});
  }

    public loginWalletUser(walletuser:WalletUser):Observable<any>{
      return this.http.post("http://localhost:8091"/validateUser/{userId}/{password}\"",walletuser,{responseType:'text'});
    }
}

