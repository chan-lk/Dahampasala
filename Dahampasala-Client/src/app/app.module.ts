import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';



import { LoginComponent } from './fnd/login/login.component';
import { RegisterComponent } from './fnd/register/register.component';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { ProfileComponent } from './fnd/profile/profile.component';
import { BoardUserComponent } from './fnd/board-user/board-user.component';
import { BoardModeratorComponent } from './fnd/board-moderator/board-moderator.component';
import { BoardAdminComponent } from './fnd/board-admin/board-admin.component';
import { DahampasalaComponent } from './web/dahampasala/dahampasala.component';
import { DahampasalaDetailsComponent } from './web/dahampasala-details/dahampasala-details.component';
import { TeacherComponent } from './web/teacher/teacher.component';
import { AddressComponent } from './web/address/address.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ProfileComponent,
    BoardUserComponent,
    BoardModeratorComponent,
    BoardAdminComponent,
    DahampasalaComponent,
    DahampasalaDetailsComponent,
    TeacherComponent,
    AddressComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
