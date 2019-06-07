import { OffersService } from './../offers.service';
import { Component, OnInit } from '@angular/core';
import { Offers } from '../model/offers';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-offers',
  templateUrl: './list-offers.component.html',
  styleUrls: ['./list-offers.component.css']
})
export class ListOffersComponent implements OnInit {

  public offers: Array<Offers>;

  constructor(private offerService: OffersService, private router: Router) { }

  ngOnInit() {
    this.offerService.getOffers().subscribe(
      data => { this.offers = data; });
  }

  onSelect(offer: Offers) {
    this.router.navigate(['/offers', offer.id]);
  }

  addOffer() {
    this.router.navigate(['/offers/add']);
  }
}
