import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { SearchrestaurantComponent } from './searchrestaurant/searchrestaurant.component';
import { AddrestaurantComponent } from './addrestaurant/addrestaurant.component';
import { SearchmenuComponent } from './searchmenu/searchmenu.component';
import { SearchorderComponent } from './searchorder/searchorder.component';


const routes: Routes = [
  {path:"restaurantlist",component:RestaurantComponent},
  {path:"searchrestaurant",component:SearchrestaurantComponent},
  {path:"addrestaurant",component:AddrestaurantComponent},
  {path:"searchmenu",component:SearchmenuComponent},
  {path:"searchorder",component:SearchorderComponent},
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
