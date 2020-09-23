import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  constructor(private restaurant: FoodService){ }
  restaurantlist;
  
    ngOnInit() {
      this.restaurant.getrestaurants()
      .subscribe(response=>{
        this.restaurantlist = response;
        console.log('response is=',response)
      },
      error=>{
        console.log('error is=',error)
      })
    }
  }

