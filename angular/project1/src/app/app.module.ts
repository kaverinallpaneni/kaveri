import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaComponent } from './media/media.component';
import { MediaphaseComponent } from './mediaphase/mediaphase.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaComponent,
    MediaphaseComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
