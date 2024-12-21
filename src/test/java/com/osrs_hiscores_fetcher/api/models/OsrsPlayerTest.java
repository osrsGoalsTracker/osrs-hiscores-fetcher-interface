package com.osrs_hiscores_fetcher.api.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class OsrsPlayerTest {

    @Test
    void testJsonDeserialization() throws IOException {
        // Given
        ObjectMapper mapper = new ObjectMapper();
        String json = """
                {"skills":[{"id":0,"name":"Overall","rank":132911,"level":2165,"xp":542582471},{"id":1,"name":"Attack","rank":4926,"level":99,"xp":58020903},{"id":2,"name":"Defence","rank":14368,"level":99,"xp":29822971},{"id":3,"name":"Strength","rank":13895,"level":99,"xp":84222561},{"id":4,"name":"Hitpoints","rank":10222,"level":99,"xp":104002577},{"id":5,"name":"Ranged","rank":17482,"level":99,"xp":89988376},{"id":6,"name":"Prayer","rank":200308,"level":93,"xp":7284505},{"id":7,"name":"Magic","rank":18649,"level":99,"xp":40419283},{"id":8,"name":"Cooking","rank":224612,"level":99,"xp":13129115},{"id":9,"name":"Woodcutting","rank":260963,"level":93,"xp":7359219},{"id":10,"name":"Fletching","rank":260474,"level":97,"xp":11450701},{"id":11,"name":"Fishing","rank":247099,"level":92,"xp":6537203},{"id":12,"name":"Firemaking","rank":435552,"level":92,"xp":6594120},{"id":13,"name":"Crafting","rank":324657,"level":89,"xp":4947848},{"id":14,"name":"Smithing","rank":212899,"level":89,"xp":4978890},{"id":15,"name":"Mining","rank":243553,"level":91,"xp":6094663},{"id":16,"name":"Herblore","rank":168677,"level":92,"xp":7092616},{"id":17,"name":"Agility","rank":156736,"level":90,"xp":5397171},{"id":18,"name":"Thieving","rank":203434,"level":93,"xp":7245019},{"id":19,"name":"Slayer","rank":27233,"level":99,"xp":23231144},{"id":20,"name":"Farming","rank":310528,"level":96,"xp":10105207},{"id":21,"name":"Runecraft","rank":141076,"level":90,"xp":5490877},{"id":22,"name":"Hunter","rank":224863,"level":88,"xp":4498854},{"id":23,"name":"Construction","rank":169751,"level":88,"xp":4668648}],"activities":[{"id":0,"name":"League Points","rank":-1,"score":-1},{"id":1,"name":"Deadman Points","rank":-1,"score":-1},{"id":2,"name":"Bounty Hunter - Hunter","rank":-1,"score":-1},{"id":3,"name":"Bounty Hunter - Rogue","rank":-1,"score":-1},{"id":4,"name":"Bounty Hunter (Legacy) - Hunter","rank":-1,"score":-1},{"id":5,"name":"Bounty Hunter (Legacy) - Rogue","rank":-1,"score":-1},{"id":6,"name":"Clue Scrolls (all)","rank":23531,"score":1362},{"id":7,"name":"Clue Scrolls (beginner)","rank":203303,"score":23},{"id":8,"name":"Clue Scrolls (easy)","rank":77713,"score":90},{"id":9,"name":"Clue Scrolls (medium)","rank":14214,"score":630},{"id":10,"name":"Clue Scrolls (hard)","rank":22933,"score":412},{"id":11,"name":"Clue Scrolls (elite)","rank":26007,"score":116},{"id":12,"name":"Clue Scrolls (master)","rank":27747,"score":91},{"id":13,"name":"LMS - Rank","rank":-1,"score":-1},{"id":14,"name":"PvP Arena - Rank","rank":-1,"score":-1},{"id":15,"name":"Soul Wars Zeal","rank":-1,"score":-1},{"id":16,"name":"Rifts closed","rank":756150,"score":8},{"id":17,"name":"Colosseum Glory","rank":66345,"score":5420},{"id":18,"name":"Abyssal Sire","rank":151288,"score":112},{"id":19,"name":"Alchemical Hydra","rank":61375,"score":1103},{"id":20,"name":"Amoxliatl","rank":38898,"score":35},{"id":21,"name":"Araxxor","rank":63756,"score":219},{"id":22,"name":"Artio","rank":-1,"score":-1},{"id":23,"name":"Barrows Chests","rank":336318,"score":165},{"id":24,"name":"Bryophyta","rank":135671,"score":10},{"id":25,"name":"Callisto","rank":176604,"score":31},{"id":26,"name":"Calvar'ion","rank":-1,"score":-1},{"id":27,"name":"Cerberus","rank":187741,"score":250},{"id":28,"name":"Chambers of Xeric","rank":1570,"score":2478},{"id":29,"name":"Chambers of Xeric: Challenge Mode","rank":3422,"score":528},{"id":30,"name":"Chaos Elemental","rank":85709,"score":55},{"id":31,"name":"Chaos Fanatic","rank":67107,"score":80},{"id":32,"name":"Commander Zilyana","rank":35232,"score":522},{"id":33,"name":"Corporeal Beast","rank":26389,"score":342},{"id":34,"name":"Crazy Archaeologist","rank":27093,"score":191},{"id":35,"name":"Dagannoth Prime","rank":114998,"score":254},{"id":36,"name":"Dagannoth Rex","rank":234209,"score":175},{"id":37,"name":"Dagannoth Supreme","rank":182157,"score":133},{"id":38,"name":"Deranged Archaeologist","rank":63723,"score":29},{"id":39,"name":"Duke Sucellus","rank":46622,"score":243},{"id":40,"name":"General Graardor","rank":34156,"score":981},{"id":41,"name":"Giant Mole","rank":126940,"score":256},{"id":42,"name":"Grotesque Guardians","rank":108815,"score":160},{"id":43,"name":"Hespori","rank":246799,"score":43},{"id":44,"name":"Kalphite Queen","rank":146286,"score":81},{"id":45,"name":"King Black Dragon","rank":35797,"score":800},{"id":46,"name":"Kraken","rank":3658,"score":7714},{"id":47,"name":"Kree'Arra","rank":72273,"score":196},{"id":48,"name":"K'ril Tsutsaroth","rank":30525,"score":374},{"id":49,"name":"Lunar Chests","rank":158998,"score":25},{"id":50,"name":"Mimic","rank":36650,"score":6},{"id":51,"name":"Nex","rank":34517,"score":700},{"id":52,"name":"Nightmare","rank":45039,"score":58},{"id":53,"name":"Phosani's Nightmare","rank":-1,"score":-1},{"id":54,"name":"Obor","rank":60035,"score":22},{"id":55,"name":"Phantom Muspah","rank":98734,"score":84},{"id":56,"name":"Sarachnis","rank":20412,"score":595},{"id":57,"name":"Scorpia","rank":46790,"score":115},{"id":58,"name":"Scurrius","rank":277905,"score":12},{"id":59,"name":"Skotizo","rank":23897,"score":67},{"id":60,"name":"Sol Heredit","rank":-1,"score":-1},{"id":61,"name":"Spindel","rank":85423,"score":38},{"id":62,"name":"Tempoross","rank":442817,"score":40},{"id":63,"name":"The Gauntlet","rank":17540,"score":106},{"id":64,"name":"The Corrupted Gauntlet","rank":150829,"score":88},{"id":65,"name":"The Hueycoatl","rank":23517,"score":97},{"id":66,"name":"The Leviathan","rank":33504,"score":101},{"id":67,"name":"The Whisperer","rank":32466,"score":81},{"id":68,"name":"Theatre of Blood","rank":9221,"score":760},{"id":69,"name":"Theatre of Blood: Hard Mode","rank":16018,"score":36},{"id":70,"name":"Thermonuclear Smoke Devil","rank":725,"score":7532},{"id":71,"name":"Tombs of Amascut","rank":4838,"score":275},{"id":72,"name":"Tombs of Amascut: Expert Mode","rank":23189,"score":248},{"id":73,"name":"TzKal-Zuk","rank":-1,"score":-1},{"id":74,"name":"TzTok-Jad","rank":202932,"score":5},{"id":75,"name":"Vardorvis","rank":51161,"score":198},{"id":76,"name":"Venenatis","rank":59797,"score":172},{"id":77,"name":"Vet'ion","rank":50994,"score":131},{"id":78,"name":"Vorkath","rank":83127,"score":924},{"id":79,"name":"Wintertodt","rank":438465,"score":252},{"id":80,"name":"Zalcano","rank":87600,"score":137},{"id":81,"name":"Zulrah","rank":48658,"score":1997}]}
                """;

        // When
        OsrsPlayer player = mapper.readValue(json, OsrsPlayer.class);

        // Then
        assertNotNull(player);
        
        // Validate skills
        assertEquals(24, player.getSkills().size());
        
        // Check specific skills
        Skill overall = player.getSkills().get(0);
        assertEquals(0, overall.getId());
        assertEquals("Overall", overall.getName());
        assertEquals(132911, overall.getRank());
        assertEquals(2165, overall.getLevel());
        assertEquals(542582471L, overall.getXp());

        Skill attack = player.getSkills().get(1);
        assertEquals(1, attack.getId());
        assertEquals("Attack", attack.getName());
        assertEquals(4926, attack.getRank());
        assertEquals(99, attack.getLevel());
        assertEquals(58020903L, attack.getXp());

        // Validate activities
        assertEquals(82, player.getActivities().size());
        
        // Check unranked activity
        Activity leaguePoints = player.getActivities().get(0);
        assertEquals(0, leaguePoints.getId());
        assertEquals("League Points", leaguePoints.getName());
        assertEquals(-1, leaguePoints.getRank());
        assertEquals(-1, leaguePoints.getScore());

        // Check ranked activity
        Activity clueScrollsAll = player.getActivities().get(6);
        assertEquals(6, clueScrollsAll.getId());
        assertEquals("Clue Scrolls (all)", clueScrollsAll.getName());
        assertEquals(23531, clueScrollsAll.getRank());
        assertEquals(1362, clueScrollsAll.getScore());

        // Check high-score activity
        Activity kraken = player.getActivities().get(46);
        assertEquals(46, kraken.getId());
        assertEquals("Kraken", kraken.getName());
        assertEquals(3658, kraken.getRank());
        assertEquals(7714, kraken.getScore());

        // Verify collections are unmodifiable
        assertThrows(UnsupportedOperationException.class, () -> 
            player.getSkills().add(new Skill(99, "Test", 1, 1, 1))
        );
        assertThrows(UnsupportedOperationException.class, () -> 
            player.getActivities().add(new Activity(99, "Test", 1, 1))
        );
    }
} 