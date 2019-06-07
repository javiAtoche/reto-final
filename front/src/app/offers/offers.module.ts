import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListOffersComponent } from './list-offers/list-offers.component';
import { OffersFormComponent } from './offers-form/offers-form.component';
import { OffersValidComponent } from './offers-valid/offers-valid.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [ListOffersComponent, OffersFormComponent, OffersValidComponent]
})
export class OffersModule { }
