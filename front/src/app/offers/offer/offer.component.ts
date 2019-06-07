import { OffersService } from './../offers.service';
import { Offers } from './../model/offers';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-offer',
  templateUrl: './offer.component.html',
  styleUrls: ['./offer.component.css']
})
export class OfferComponent implements OnInit {

  errorMessage: string;
  offer: Offers;

  constructor(private route: ActivatedRoute, private router: Router, private offerService: OffersService) {
    this.offer = <Offers>{};
     }

  ngOnInit() {
    const offerId = this.route.snapshot.params['id'];
    this.offerService.getOfferById(offerId).subscribe(
      offer => this.offer = offer,
      error => this.errorMessage = <any> error
    );
  }

  gotoOffersList() {
    this.router.navigate(['/offers']);
  }

  editOffer() {
    this.router.navigate(['/offers', this.offer.id, 'edit']);
  }
}
