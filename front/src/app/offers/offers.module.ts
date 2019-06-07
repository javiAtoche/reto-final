import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListOffersComponent } from './list-offers/list-offers.component';
import { OfferComponent } from './offer/offer.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [ListOffersComponent, OfferComponent]
})
export class OffersModule { }
