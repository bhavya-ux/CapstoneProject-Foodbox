import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-searchrestaurant',
  templateUrl: './searchrestaurant.component.html',
  styleUrls: ['./searchrestaurant.component.css']
})
export class SearchrestaurantComponent implements OnInit {

  private locationresponse;
  private restaurantLocation;

  constructor(private restaurant: FoodService) 
    { }

  ngOnInit() {
  }
  searchrestaurantbylocation()
 {
   this.restaurant.searchrestaurantbylocation(this.restaurantLocation).subscribe(response=>{
     this.locationresponse = response;
     console.log('response is = ', this.locationresponse)
   },
   error=>{
    console.log('error is=',error)
  })
 }
}
