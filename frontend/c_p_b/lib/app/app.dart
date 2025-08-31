import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/colors.dart';
import 'package:c_p_b/presentation/pages/login_page.dart';

class App extends StatelessWidget {
  const App({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: const Color.fromARGB(255, 185, 0, 25),
          brightness: Brightness.dark,
        ),
        appBarTheme: AppBarTheme(centerTitle: true),
      ),
      home: LoginPage(),
    );
  }
}
