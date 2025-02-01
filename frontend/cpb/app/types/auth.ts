export interface User {
    id: number;
    name: string;
    surname: string;
    email: string;
    activationCode: string | null;
    jwtCreatedOn: string;
    activ: boolean;
  }
  
  export interface LoginResponse {
    user: User;
    jwt: string;
  }
  
  export interface LoginCredentials {
    email: string;
    password: string;
  }