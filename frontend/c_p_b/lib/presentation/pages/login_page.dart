import 'package:c_p_b/presentation/styles/dimens.dart';

import 'package:c_p_b/utils/utils.dart';
import 'package:c_p_b/presentation/ui/navigation_button.dart';
import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Login")),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          spacing: kSpaceHuge,
          children: [
            Image.asset('assets/images/basket_1.png', width: 150, height: 150),
            NavigationButton(
              onPressed: () => Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => const Placeholder()),
              ),
              label: 'password dimenticata?',
            ),
            NavigationButton(
              onPressed: () => Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => const Placeholder()),
              ),
              label: 'aceso senza autenticazione',
            ),
            NavigationButton(
              onPressed: () => Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => const Placeholder()),
              ),
              label: "registration",
            ),
          ],
        ),
      ),
    );
  }
}
