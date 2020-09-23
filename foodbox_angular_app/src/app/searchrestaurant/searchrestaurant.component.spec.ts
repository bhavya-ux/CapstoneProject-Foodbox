import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchrestaurantComponent } from './searchrestaurant.component';

describe('SearchrestaurantComponent', () => {
  let component: SearchrestaurantComponent;
  let fixture: ComponentFixture<SearchrestaurantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchrestaurantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchrestaurantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
