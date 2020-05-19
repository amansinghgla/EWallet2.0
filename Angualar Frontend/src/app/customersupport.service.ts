import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import{CustomerSupport} from './customersupport'
@Injectable({
  providedIn: 'root'
})
export class CustomersupportService {

  constructor(private http:HttpClient) { }

  public addIssue(customersupport:CustomerSupport):Observable<any>{
    return this.http.post("http://localhost:8091/addissue",customersupport,{responseType:'text'});
  }

}
