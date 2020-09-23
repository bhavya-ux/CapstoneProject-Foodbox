import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms'
import {HttpClientModule} from '@angular/common/http';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { SearchrestaurantComponent } from './searchrestaurant/searchrestaurant.component';
import { AddrestaurantComponent } from './addrestaurant/addrestaurant.component';
import { SearchmenuComponent } from './searchmenu/searchmenu.component';
import { SearchorderComponent } from './searchorder/searchorder.component';
@NgModule({
  declarations: [
    AppComponent,
    RestaurantComponent,
    SearchrestaurantComponent,
    AddrestaurantComponent,
    SearchmenuComponent,
    SearchorderComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
