import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustompipePipe } from './pipes/custompipe.pipe';
import { CustompipeComponent } from './pipes/custompipe/custompipe.component';

@NgModule({
  declarations: [
    AppComponent,
    CustompipePipe,
    CustompipeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
