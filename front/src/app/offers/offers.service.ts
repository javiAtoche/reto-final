import { Observable } from 'rxjs';
import { HandleError, HttpErrorHandler } from 'app/error.service';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Offers } from './model/offers';
import { environment } from 'environments/environment';
import { catchError } from 'rxjs/operators';
import { pipe } from '@angular/core/src/render3/pipe';

@Injectable({
  providedIn: 'root'
})
export class OffersService {

  constructor(private http: HttpClient, private httpErrorHandler: HttpErrorHandler) {
  }

  getOffers() {
    return this.http.get<Offers[]>('');
  }
  getOfferById(offer_id: number) {
    return this.http.get<Offers>('' + offer_id);
  }
  addOffer(offer: Offers): Observable<Offers> {
    const headers = new HttpHeaders();
    headers.append('Content-Type', 'application/json');
    headers.append('Accept', 'application/json');
    return this.http.post<Offers>('', offer, { headers });
  }
}
