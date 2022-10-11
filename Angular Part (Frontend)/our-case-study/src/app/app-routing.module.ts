import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './component/cart/cart.component';
import { OrderSuccessfulComponent } from './component/ordersuccess/order-successful.component';
import { OrderComponent } from './component/order/order.component';
import { ProductsComponent } from './component/products/products.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [
 {path : '', redirectTo: 'login', pathMatch: 'full'},
 {path:'login',component:LoginComponent},
 {path:'registration',component:RegistrationComponent},
 {path : 'products', component: ProductsComponent},
 {path: 'cart', component: CartComponent},

 {path:'orders',component:OrderComponent},
 {path:'ordersuccessful',component:OrderSuccessfulComponent},
 {path:'Header', component:HeaderComponent}

]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
