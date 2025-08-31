import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/colors.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';

class ListingStatView extends StatelessWidget {
  const ListingStatView({super.key, required this.title, required this.value});

  final String title;
  final String value;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(kPaddingMain),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        spacing: kSpaceSmall,
        children: [
          Text(title, style: TextStyle(fontSize: 12, color: Colors.black87)),
          Text(
            value,
            style: TextStyle(
              fontSize: 16,
              fontWeight: FontWeight.bold,
              color: kBrandColorPrimary,
            ),
          ),
        ],
      ),
    );
  }
}
