//Order Component Logic

import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Order } from 'src/app/Orders';
import { OrderService } from 'src/app/service/order.service';
import { Placeholder } from '@angular/compiler/src/i18n/i18n_ast';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  order = new Order;
  msg = '';

  constructor(private _service: OrderService, private http: HttpClient, private router: Router) { }



  ngOnInit(): void {
  }
  placeOrder() {
    this._service.placeOrder(this.order).subscribe(
      data => {
        console.log("response recieved");
        this.msg = "order success";
        if (true) {
          this.goToOrderSuccess();
        }
      }, error => {
        console.log("exception occured");
        this.msg = error.error;
      }
    )

  }

  goToOrderSuccess() {
    this.router.navigate(["ordersuccess"]);
  }
}
