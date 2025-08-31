import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';
import 'package:c_p_b/utils/utils.dart';

class JobInfoView extends StatelessWidget {
  const JobInfoView({super.key, required this.icon, required this.info});

  final IconData icon;
  final String info;

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        Icon(icon, color: Colors.grey.shade400, size: 20),
        gapW(kSpaceMain),
        Text(
          info,
          style: TextStyle(
            color: Colors.black,
            fontSize: 14,
            fontWeight: FontWeight.w500,
          ),
        ),
      ],
    );
  }
}
