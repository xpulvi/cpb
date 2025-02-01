const API_URL = 'http://127.0.0.1:8080/auth'; // Assicurati che questo sia l'URL corretto del tuo backend

interface LoginDto {
  email: string;
  password: string;
}

interface SignupDto {
  email: string;
  password: string;
}

interface LoginResponse {
  jwt: string;
  user: {
    id: number;
    email: string;
    // altri campi utente se necessario
  };
}

export const authService = {
  async login(credentials: LoginDto): Promise<LoginResponse> {
    const response = await fetch(`${API_URL}/login`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(credentials),
    });

    if (!response.ok) {
      throw new Error('Login failed');
    }

    return response.json();
  },

  async signup(userData: SignupDto): Promise<void> {
    const response = await fetch(`${API_URL}/signup`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(userData),
    });

    if (!response.ok) {
      throw new Error('Signup failed');
    }
  },

  async activateAccount(activationCode: string): Promise<void> {
    const response = await fetch(`${API_URL}/signup/activation`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ activationCode }),
    });

    if (!response.ok) {
      throw new Error('Account activation failed');
    }
  }
};