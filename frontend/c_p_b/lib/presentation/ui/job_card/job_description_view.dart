import 'package:flutter/material.dart';

class JobDescriptionView extends StatelessWidget {
  const JobDescriptionView(this.description, {super.key});

  final String description;

  @override
  Widget build(BuildContext context) {
    return Text(
      description,
      style: TextStyle(
        color: Colors.black54,
        fontSize: 14,
        fontWeight: FontWeight.normal,
      ),
    );
  }
}
