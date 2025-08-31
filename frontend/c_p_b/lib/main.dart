import 'package:flutter/material.dart';
import 'package:c_p_b/app/app.dart';
import 'package:c_p_b/data/repository/database_repository.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await DatabaseRepository().init();
  runApp(const App());
}
