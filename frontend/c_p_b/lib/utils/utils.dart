import 'dart:convert';
import 'dart:math';

import 'package:crypto/crypto.dart';
import 'package:flutter/material.dart';

SizedBox gapH(double height) => SizedBox(height: height);

SizedBox gapW(double width) => SizedBox(width: width);

double getScreenHeight(BuildContext context) {
  return MediaQuery.sizeOf(context).height;
}

double getScreenWidth(BuildContext context) {
  return MediaQuery.sizeOf(context).width;
}

void customPrintLog(String message) {
  debugPrint(message);
}

String getRandomString(int length) {
  const chars =
      'AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789';
  final random = Random.secure();
  return String.fromCharCodes(
    Iterable.generate(
      length,
      (_) => chars.codeUnitAt(random.nextInt(chars.length)),
    ),
  );
}

String createHashedString(String input, {bool useMD5 = true}) {
  // Converti la stringa in bytes UTF-8
  final bytes = utf8.encode(input);
  // Calcola l'hash in base all'algoritmo selezionato
  final digest = useMD5 ? md5.convert(bytes) : sha256.convert(bytes);
  // Converti l'hash in una stringa esadecimale
  return digest.toString();
}
