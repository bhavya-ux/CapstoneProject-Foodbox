import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addrestaurant',
  templateUrl: './addrestaurant.component.html',
  styleUrls: ['./addrestaurant.component.css']
})
export class AddrestaurantComponent implements OnInit {
  restaurant;
  addedrestaurant;

  constructor(
  private service : FoodService,
  private router : Router ) { }

  ngOnInit() {
    this.restaurant = {
    "restaurantCuisine": "",
    "restaurantId": null,
    "restaurantLocation": "",
    "restaurantName": ""
  }

}


 addrestaurant()
  {
    this.service.addrestaurant(this.restaurant).subscribe(response =>{
      console.log(response)
      this.addedrestaurant= response;
      this.router.navigate(['/restaurantlist'])
    
    },
    error=>{
      console.log(error)
    })
  }
  }