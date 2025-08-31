import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/colors.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';
import 'package:c_p_b/presentation/ui/job_card/job_description_view.dart';
import 'package:c_p_b/presentation/ui/job_card/job_info_view.dart';
import 'package:c_p_b/presentation/ui/job_card/job_title_view.dart';
import 'package:c_p_b/utils/utils.dart';

class JobCard extends StatelessWidget {
  const JobCard({
    super.key,
    required this.label,
    required this.title,
    required this.description,
    required this.location,
    required this.time,
    required this.salary,
  });

  final String label;
  final String title;
  final String description;
  final String location;
  final String time;
  final String salary;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(kPaddingHuge),
      margin: EdgeInsets.all(kMarginMain),
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(kRadiusBig),
        boxShadow: [
          BoxShadow(
            color: Colors.black.withAlpha(20),
            blurRadius: 10,
            offset: Offset(0, 2), // changes position of shadow
          ),
        ],
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          Container(
            padding: EdgeInsets.symmetric(
              horizontal: kPaddingMain,
              vertical: kPaddingTiny,
            ),
            decoration: BoxDecoration(
              color: kBrandColorPrimary.withAlpha(10),
              borderRadius: BorderRadius.circular(kRadiusMain * 2),
            ),
            child: Text(
              label,
              style: TextStyle(
                color: kBrandColorPrimary,
                fontSize: 12,
                fontWeight: FontWeight.w500,
              ),
            ),
          ),
          gapH(kSpaceMain),
          JobTitleView(title),
          gapH(kSpaceMain),
          JobDescriptionView(description),
          gapH(kSpaceHuge),
          Row(
            children: [
              JobInfoView(icon: Icons.schedule, info: time),
              gapW(kSpaceBig),
              JobInfoView(icon: Icons.location_pin, info: location),
              gapW(kSpaceBig),
              JobInfoView(icon: Icons.payment, info: salary),
              gapW(kSpaceBig),
              Spacer(),
              TextButton.icon(
                onPressed: () {},
                label: Text(
                  "View Job",
                  style: TextStyle(color: kBrandColorPrimary),
                ),
                icon: Icon(Icons.arrow_forward, color: kBrandColorPrimary),
                iconAlignment: IconAlignment.end,
              ),
            ],
          ),
        ],
      ),
    );
  }
}
