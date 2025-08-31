import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';
import 'package:c_p_b/utils/utils.dart';

class ListingServiceView extends StatelessWidget {
  const ListingServiceView({super.key, required this.icon, required this.info});

  final IconData icon;
  final int info;

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        Icon(icon, color: Colors.grey.shade600, size: 28),
        gapW(kSpaceMain),
        Text(
          info.toString(),
          style: TextStyle(
            color: Colors.black,
            fontSize: 16,
            fontWeight: FontWeight.normal,
          ),
        ),
      ],
    );
  }
}
