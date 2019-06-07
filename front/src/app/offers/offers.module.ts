import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListOffersComponent } from './list-offers/list-offers.component';
import { OfferComponent } from './offer/offer.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    FormsModule
  ],
  declarations: [ListOffersComponent, OfferComponent]
})
export class OffersModule { }
