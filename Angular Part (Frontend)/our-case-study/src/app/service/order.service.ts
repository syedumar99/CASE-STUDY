import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from '../Orders';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  constructor(private http:HttpClient) { }

  public placeOrder(order:Order):Observable<any>{
    return this.http.post<any>("http://localhost:8016/orders",order)
  }
}
